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

public val DuotoneGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(104.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 104.0f, 168.0f)
                close()
                moveTo(192.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 192.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.2f, 151.87f)
                verticalLineToRelative(0.0f)
                arcToRelative(47.1f, 47.1f, 0.0f, false, false, -2.35f, -5.45f)
                lineTo(193.26f, 51.8f)
                arcToRelative(7.82f, 7.82f, 0.0f, false, false, -1.66f, -2.44f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 55.0f)
                verticalLineTo(80.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(55.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f)
                arcToRelative(7.82f, 7.82f, 0.0f, false, false, -1.66f, 2.44f)
                lineTo(21.15f, 146.4f)
                arcToRelative(47.1f, 47.1f, 0.0f, false, false, -2.35f, 5.45f)
                verticalLineToRelative(0.0f)
                arcTo(48.0f, 48.0f, 0.0f, true, false, 112.0f, 168.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 93.2f, -16.13f)
                close()
                moveTo(76.71f, 59.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 19.29f, -1.0f)
                verticalLineToRelative(73.51f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, false, -46.79f, -9.92f)
                close()
                moveTo(64.0f, 200.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 64.0f, 200.0f)
                close()
                moveTo(160.0f, 58.74f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 19.29f, 1.0f)
                lineToRelative(27.5f, 62.58f)
                arcTo(47.9f, 47.9f, 0.0f, false, false, 160.0f, 132.25f)
                close()
                moveTo(192.0f, 200.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 192.0f, 200.0f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
