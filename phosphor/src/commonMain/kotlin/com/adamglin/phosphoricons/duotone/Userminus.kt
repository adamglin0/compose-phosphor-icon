package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.UserMinus: ImageVector
    get() {
        if (_userMinus != null) {
            return _userMinus!!
        }
        _userMinus = Builder(name = "UserMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 100.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, -60.0f, -60.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 168.0f, 100.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(200.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
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
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
