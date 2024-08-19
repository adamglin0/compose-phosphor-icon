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

public val DuotoneGroup.Swatches: ImageVector
    get() {
        if (_swatches != null) {
            return _swatches!!
        }
        _swatches = Builder(name = "Swatches", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(135.88f, 43.11f)
                lineToRelative(-25.0f, 143.14f)
                arcToRelative(35.71f, 35.71f, 0.0f, false, true, -41.34f, 29.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -28.95f, -41.71f)
                lineToRelative(25.0f, -143.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.19f, -6.49f)
                lineToRelative(54.67f, 9.73f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 135.88f, 43.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 180.0f)
                close()
                moveTo(240.0f, 156.19f)
                lineTo(240.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(76.0f, 224.0f)
                arcToRelative(46.36f, 46.36f, 0.0f, false, true, -7.94f, -0.68f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -35.43f, -50.95f)
                lineToRelative(25.0f, -143.13f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, true, 18.47f, -13.0f)
                lineTo(130.84f, 26.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 12.92f, 18.52f)
                lineToRelative(-12.08f, 69.0f)
                lineTo(199.49f, 89.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 20.45f, 9.52f)
                lineTo(239.0f, 150.69f)
                arcTo(18.35f, 18.35f, 0.0f, false, true, 240.0f, 156.19f)
                close()
                moveTo(103.0f, 184.87f)
                lineTo(128.0f, 41.74f)
                lineTo(73.46f, 32.0f)
                lineToRelative(-25.0f, 143.1f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 70.9f, 207.57f)
                arcTo(27.29f, 27.29f, 0.0f, false, false, 91.46f, 203.0f)
                arcTo(27.84f, 27.84f, 0.0f, false, false, 103.0f, 184.87f)
                close()
                moveTo(116.78f, 195.0f)
                lineTo(224.0f, 156.11f)
                lineTo(204.92f, 104.0f)
                lineTo(128.5f, 131.7f)
                lineToRelative(-9.78f, 55.92f)
                arcTo(44.63f, 44.63f, 0.0f, false, true, 116.78f, 195.0f)
                close()
                moveTo(224.0f, 173.12f)
                lineTo(127.74f, 208.0f)
                lineTo(224.0f, 208.0f)
                close()
            }
        }
        .build()
        return _swatches!!
    }

private var _swatches: ImageVector? = null
