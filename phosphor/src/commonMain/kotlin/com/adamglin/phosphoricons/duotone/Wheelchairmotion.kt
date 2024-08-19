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

public val DuotoneGroup.Wheelchairmotion: ImageVector
    get() {
        if (_wheelchairmotion != null) {
            return _wheelchairmotion!!
        }
        _wheelchairmotion = Builder(name = "Wheelchairmotion", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 200.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 176.0f, 80.0f)
                close()
                moveTo(176.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 32.0f)
                close()
                moveTo(168.0f, 168.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -64.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(206.19f, 130.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.65f, 6.64f)
                lineToRelative(-16.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 224.0f)
                arcToRelative(7.77f, 7.77f, 0.0f, false, true, -1.58f, -0.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.27f, -9.41f)
                lineTo(190.24f, 144.0f)
                lineTo(128.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.94f, -12.0f)
                lineToRelative(20.06f, -34.9f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, false, -88.0f, 9.17f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 42.91f, 94.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 113.46f, -6.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.57f, 10.69f)
                lineTo(141.82f, 128.0f)
                lineTo(200.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 206.19f, 130.93f)
                close()
            }
        }
        .build()
        return _wheelchairmotion!!
    }

private var _wheelchairmotion: ImageVector? = null
