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

public val DuotoneGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 98.36f)
                curveTo(230.73f, 136.92f, 198.67f, 168.0f, 160.09f, 168.0f)
                arcToRelative(71.68f, 71.68f, 0.0f, false, true, -26.92f, -5.17f)
                horizontalLineToRelative(0.0f)
                lineTo(120.0f, 176.0f)
                horizontalLineTo(96.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(72.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(187.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.34f, -5.65f)
                lineToRelative(58.83f, -58.83f)
                horizontalLineToRelative(0.0f)
                arcTo(71.68f, 71.68f, 0.0f, false, true, 88.0f, 95.91f)
                curveToRelative(0.0f, -38.58f, 31.08f, -70.64f, 69.64f, -71.87f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 232.0f, 98.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.57f, 39.43f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 83.91f, 120.78f)
                lineTo(28.69f, 176.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 24.0f, 187.31f)
                verticalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(184.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.34f)
                lineToRelative(9.56f, -9.57f)
                arcTo(79.73f, 79.73f, 0.0f, false, false, 160.0f, 176.0f)
                horizontalLineToRelative(0.1f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 216.57f, 39.43f)
                close()
                moveTo(224.0f, 98.1f)
                curveToRelative(-1.09f, 34.09f, -29.75f, 61.86f, -63.89f, 61.9f)
                horizontalLineTo(160.0f)
                arcToRelative(63.7f, 63.7f, 0.0f, false, true, -23.65f, -4.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.84f, 1.68f)
                lineTo(116.69f, 168.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(187.31f)
                lineToRelative(58.83f, -58.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.68f, -8.84f)
                arcTo(63.72f, 63.72f, 0.0f, false, true, 96.0f, 95.92f)
                curveToRelative(0.0f, -34.14f, 27.81f, -62.8f, 61.9f, -63.89f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 224.0f, 98.1f)
                close()
                moveTo(192.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 76.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
