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

public val DuotoneGroup.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(107.14f, 98.8f)
                lineTo(128.0f, 128.0f)
                lineToRelative(-20.86f, 29.2f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 55.06f, 184.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(72.0f)
                horizontalLineTo(55.06f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 107.14f, 98.8f)
                close()
                moveTo(200.94f, 72.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -52.08f, 26.8f)
                lineTo(128.0f, 128.0f)
                lineToRelative(20.86f, 29.2f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 200.94f, 184.0f)
                horizontalLineTo(232.0f)
                verticalLineTo(72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 178.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(212.69f, 192.0f)
                lineTo(200.94f, 192.0f)
                arcToRelative(72.12f, 72.12f, 0.0f, false, true, -58.59f, -30.15f)
                lineToRelative(-41.72f, -58.4f)
                arcTo(56.1f, 56.1f, 0.0f, false, false, 55.06f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(55.06f, 64.0f)
                arcToRelative(72.12f, 72.12f, 0.0f, false, true, 58.59f, 30.15f)
                lineToRelative(41.72f, 58.4f)
                arcTo(56.1f, 56.1f, 0.0f, false, false, 200.94f, 176.0f)
                horizontalLineToRelative(11.75f)
                lineToRelative(-10.35f, -10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                close()
                moveTo(143.0f, 107.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.16f, -1.86f)
                lineToRelative(1.2f, -1.67f)
                arcTo(56.1f, 56.1f, 0.0f, false, true, 200.94f, 80.0f)
                horizontalLineToRelative(11.75f)
                lineTo(202.34f, 90.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(212.69f, 64.0f)
                lineTo(200.94f, 64.0f)
                arcToRelative(72.12f, 72.12f, 0.0f, false, false, -58.59f, 30.15f)
                lineToRelative(-1.2f, 1.67f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 143.0f, 107.0f)
                close()
                moveTo(113.0f, 149.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.16f, 1.86f)
                lineToRelative(-1.2f, 1.67f)
                arcTo(56.1f, 56.1f, 0.0f, false, true, 55.06f, 176.0f)
                lineTo(32.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(55.06f, 192.0f)
                arcToRelative(72.12f, 72.12f, 0.0f, false, false, 58.59f, -30.15f)
                lineToRelative(1.2f, -1.67f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 113.0f, 149.0f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
