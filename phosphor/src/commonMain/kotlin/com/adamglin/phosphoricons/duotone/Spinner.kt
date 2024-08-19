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

public val DuotoneGroup.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 32.0f)
                lineTo(136.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(173.25f, 90.75f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.35f)
                lineToRelative(22.63f, -22.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(167.6f, 77.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.65f, 13.66f)
                close()
                moveTo(224.0f, 120.0f)
                lineTo(192.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(178.91f, 167.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 11.31f)
                lineToRelative(22.62f, 22.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 184.0f)
                close()
                moveTo(77.09f, 167.6f)
                lineTo(54.46f, 190.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(88.4f, 178.91f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 77.09f, 167.6f)
                close()
                moveTo(72.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(32.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(64.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 128.0f)
                close()
                moveTo(65.78f, 54.46f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 54.46f, 65.78f)
                lineTo(77.09f, 88.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.4f, 77.09f)
                close()
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
