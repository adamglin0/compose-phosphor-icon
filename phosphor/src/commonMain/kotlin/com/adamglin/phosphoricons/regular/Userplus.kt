package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Userplus: ImageVector
    get() {
        if (_userplus != null) {
            return _userplus!!
        }
        _userplus = Builder(name = "Userplus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(232.0f, 144.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 144.0f)
                lineTo(200.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(216.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 136.0f)
                close()
                moveTo(198.13f, 194.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.26f, 10.3f)
                curveTo(165.75f, 181.19f, 138.09f, 168.0f, 108.0f, 168.0f)
                reflectiveCurveToRelative(-57.75f, 13.19f, -77.87f, 37.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.25f, -10.3f)
                curveToRelative(14.94f, -17.78f, 33.52f, -30.41f, 54.17f, -37.17f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 71.9f, 0.0f)
                curveTo(164.6f, 164.44f, 183.18f, 177.07f, 198.13f, 194.85f)
                close()
                moveTo(108.0f, 152.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -52.0f, -52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 108.0f, 152.0f)
                close()
            }
        }
        .build()
        return _userplus!!
    }

private var _userplus: ImageVector? = null
