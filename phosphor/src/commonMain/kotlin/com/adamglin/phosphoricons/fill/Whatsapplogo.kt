package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Whatsapplogo: ImageVector
    get() {
        if (_whatsapplogo != null) {
            return _whatsapplogo!!
        }
        _whatsapplogo = Builder(name = "Whatsapplogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.58f, 145.23f)
                lineToRelative(23.0f, 11.48f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 176.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 99.29f, 80.46f)
                lineToRelative(11.48f, 23.0f)
                lineTo(101.0f, 118.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.73f, 7.51f)
                arcToRelative(56.47f, 56.47f, 0.0f, false, false, 30.15f, 30.15f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 138.0f, 155.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 79.12f, 219.82f)
                lineTo(45.07f, 231.17f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -20.24f, -20.24f)
                lineToRelative(11.35f, -34.05f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 232.0f, 128.0f)
                close()
                moveTo(192.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.42f, -7.16f)
                lineToRelative(-32.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 0.5f)
                lineToRelative(-14.69f, 9.8f)
                arcToRelative(40.55f, 40.55f, 0.0f, false, true, -16.0f, -16.0f)
                lineToRelative(9.8f, -14.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.5f, -8.0f)
                lineToRelative(-16.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 64.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, 88.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 192.0f, 152.0f)
                close()
            }
        }
        .build()
        return _whatsapplogo!!
    }

private var _whatsapplogo: ImageVector? = null
