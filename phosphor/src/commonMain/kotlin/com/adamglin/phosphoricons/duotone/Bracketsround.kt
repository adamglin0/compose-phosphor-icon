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

public val DuotoneGroup.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) {
            return _bracketsRound!!
        }
        _bracketsRound = Builder(name = "BracketsRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                curveToRelative(0.0f, 64.0f, -40.0f, 88.0f, -40.0f, 88.0f)
                horizontalLineTo(72.0f)
                reflectiveCurveToRelative(-40.0f, -24.0f, -40.0f, -88.0f)
                reflectiveCurveTo(72.0f, 40.0f, 72.0f, 40.0f)
                horizontalLineTo(184.0f)
                reflectiveCurveTo(224.0f, 64.0f, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 128.0f)
                curveToRelative(0.0f, 58.29f, 34.67f, 80.25f, 36.15f, 81.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.27f, 13.7f)
                curveTo(66.09f, 221.78f, 24.0f, 195.75f, 24.0f, 128.0f)
                reflectiveCurveTo(66.09f, 34.22f, 67.88f, 33.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.26f, 13.7f)
                curveTo(74.54f, 47.83f, 40.0f, 69.82f, 40.0f, 128.0f)
                close()
                moveTo(188.12f, 33.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.27f, 13.7f)
                curveTo(181.33f, 47.75f, 216.0f, 69.71f, 216.0f, 128.0f)
                reflectiveCurveToRelative(-34.67f, 80.25f, -36.12f, 81.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.24f, 13.72f)
                curveTo(189.91f, 221.78f, 232.0f, 195.75f, 232.0f, 128.0f)
                reflectiveCurveTo(189.91f, 34.22f, 188.12f, 33.14f)
                close()
            }
        }
        .build()
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
