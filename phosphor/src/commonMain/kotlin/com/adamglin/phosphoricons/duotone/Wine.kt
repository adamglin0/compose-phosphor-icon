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

public val DuotoneGroup.Wine: ImageVector
    get() {
        if (_wine != null) {
            return _wine!!
        }
        _wine = Builder(name = "Wine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(182.48f, 162.5f)
                arcToRelative(79.77f, 79.77f, 0.0f, false, true, -109.0f, 0.0f)
                arcTo(55.86f, 55.86f, 0.0f, false, true, 58.3f, 105.93f)
                lineToRelative(1.57f, -5.31f)
                horizontalLineToRelative(0.0f)
                curveTo(72.49f, 95.21f, 95.2f, 91.4f, 128.0f, 108.0f)
                curveToRelative(35.86f, 18.16f, 59.67f, 11.89f, 71.42f, 5.84f)
                horizontalLineToRelative(0.0f)
                arcTo(55.72f, 55.72f, 0.0f, false, true, 182.48f, 162.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.33f, 103.67f)
                lineTo(183.56f, 29.74f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 175.89f, 24.0f)
                horizontalLineTo(80.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.67f, 5.74f)
                lineTo(50.67f, 103.67f)
                arcToRelative(63.46f, 63.46f, 0.0f, false, false, 17.42f, 64.67f)
                arcTo(87.41f, 87.41f, 0.0f, false, false, 120.0f, 191.63f)
                verticalLineTo(232.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(191.63f)
                arcToRelative(87.39f, 87.39f, 0.0f, false, false, 51.91f, -23.29f)
                arcTo(63.48f, 63.48f, 0.0f, false, false, 205.33f, 103.67f)
                close()
                moveTo(86.09f, 40.0f)
                horizontalLineToRelative(83.82f)
                lineTo(190.0f, 108.19f)
                curveToRelative(0.09f, 0.3f, 0.17f, 0.6f, 0.25f, 0.9f)
                curveToRelative(-21.42f, 7.68f, -45.54f, -1.6f, -58.63f, -8.23f)
                curveTo(106.43f, 88.11f, 86.43f, 86.49f, 71.68f, 88.93f)
                close()
                moveTo(177.0f, 156.65f)
                arcToRelative(71.69f, 71.69f, 0.0f, false, true, -98.0f, 0.0f)
                arcToRelative(47.55f, 47.55f, 0.0f, false, true, -13.0f, -48.46f)
                lineToRelative(0.45f, -1.52f)
                curveToRelative(12.0f, -4.06f, 31.07f, -5.14f, 57.93f, 8.47f)
                curveToRelative(11.15f, 5.65f, 29.16f, 12.85f, 48.43f, 12.85f)
                arcToRelative(68.64f, 68.64f, 0.0f, false, false, 19.05f, -2.6f)
                arcTo(47.2f, 47.2f, 0.0f, false, true, 177.0f, 156.65f)
                close()
            }
        }
        .build()
        return _wine!!
    }

private var _wine: ImageVector? = null
