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

public val ThinGroup.Flipvertical: ImageVector
    get() {
        if (_flipvertical != null) {
            return _flipvertical!!
        }
        _flipvertical = Builder(name = "Flipvertical", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 116.0f)
                lineTo(216.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.6f, -23.09f)
                lineToRelative(-160.0f, -64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineToRelative(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 116.0f)
                close()
                moveTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.57f, 0.32f)
                lineToRelative(0.07f, 0.0f)
                lineToRelative(159.91f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 108.0f)
                lineTo(56.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                close()
                moveTo(227.74f, 149.61f)
                arcTo(11.75f, 11.75f, 0.0f, false, false, 216.0f, 140.0f)
                lineTo(56.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 4.59f, -0.93f)
                lineToRelative(160.0f, -64.0f)
                lineToRelative(0.08f, 0.0f)
                arcTo(11.75f, 11.75f, 0.0f, false, false, 227.74f, 149.61f)
                close()
                moveTo(217.57f, 155.67f)
                lineTo(57.57f, 219.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 52.0f, 216.0f)
                lineTo(52.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.59f, 7.67f)
                close()
            }
        }
        .build()
        return _flipvertical!!
    }

private var _flipvertical: ImageVector? = null
