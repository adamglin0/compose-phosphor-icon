package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Userplus: ImageVector
    get() {
        if (_userplus != null) {
            return _userplus!!
        }
        _userplus = Builder(name = "Userplus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(228.0f, 140.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(220.0f, 140.0f)
                lineTo(200.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(220.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 252.0f, 136.0f)
                close()
                moveTo(195.06f, 197.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.12f, 5.14f)
                curveTo(168.0f, 177.7f, 139.3f, 164.0f, 108.0f, 164.0f)
                reflectiveCurveToRelative(-60.0f, 13.7f, -80.94f, 38.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.12f, -5.14f)
                curveToRelative(16.71f, -19.9f, 38.13f, -33.13f, 61.89f, -38.59f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 50.34f, 0.0f)
                curveTo(156.93f, 164.3f, 178.35f, 177.53f, 195.06f, 197.43f)
                close()
                moveTo(108.0f, 156.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -56.0f, -56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 108.0f, 156.0f)
                close()
            }
        }
        .build()
        return _userplus!!
    }

private var _userplus: ImageVector? = null
