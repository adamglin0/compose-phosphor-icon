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

public val ThinGroup.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) {
            return _bracketsRound!!
        }
        _bracketsRound = Builder(name = "BracketsRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(55.0f, 62.67f)
                curveTo(46.34f, 74.93f, 36.0f, 96.22f, 36.0f, 128.0f)
                reflectiveCurveToRelative(10.34f, 53.07f, 19.0f, 65.33f)
                curveToRelative(9.41f, 13.3f, 19.0f, 19.19f, 19.06f, 19.24f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -0.57f)
                curveTo(68.23f, 218.4f, 28.0f, 193.51f, 28.0f, 128.0f)
                reflectiveCurveTo(68.23f, 37.6f, 69.94f, 36.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.13f, 6.86f)
                curveTo(74.0f, 43.48f, 64.42f, 49.37f, 55.0f, 62.67f)
                close()
                moveTo(186.05f, 36.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.13f, 6.86f)
                curveToRelative(0.1f, 0.0f, 9.65f, 5.94f, 19.06f, 19.24f)
                curveToRelative(8.67f, 12.26f, 19.0f, 33.55f, 19.0f, 65.33f)
                reflectiveCurveToRelative(-10.34f, 53.07f, -19.0f, 65.33f)
                curveToRelative(-9.41f, 13.3f, -19.0f, 19.19f, -19.05f, 19.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.12f, 6.86f)
                curveToRelative(1.71f, -1.0f, 41.94f, -25.92f, 41.94f, -91.43f)
                reflectiveCurveTo(187.77f, 37.6f, 186.06f, 36.57f)
                close()
            }
        }
        .build()
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
