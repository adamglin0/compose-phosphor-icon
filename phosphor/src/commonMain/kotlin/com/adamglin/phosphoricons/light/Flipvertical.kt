package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Flipvertical: ImageVector
    get() {
        if (_flipvertical != null) {
            return _flipvertical!!
        }
        _flipvertical = Builder(name = "Flipvertical", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 118.0f)
                lineTo(216.0f, 118.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 5.46f, -26.9f)
                lineToRelative(-0.11f, 0.0f)
                lineToRelative(-159.95f, -64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                verticalLineToRelative(64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 56.0f, 118.0f)
                close()
                moveTo(54.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.79f, 0.16f)
                lineToRelative(0.11f, 0.05f)
                lineToRelative(159.92f, 64.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 106.0f)
                lineTo(56.0f, 106.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(216.0f, 138.0f)
                lineTo(56.0f, 138.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.39f, 12.92f)
                lineToRelative(160.0f, -64.0f)
                lineToRelative(0.11f, -0.05f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 138.0f)
                close()
                moveTo(216.82f, 153.83f)
                lineTo(56.9f, 217.83f)
                lineTo(56.79f, 217.88f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 54.0f, 216.0f)
                lineTo(54.0f, 152.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(216.0f, 150.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.82f, 3.83f)
                close()
            }
        }
        .build()
        return _flipvertical!!
    }

private var _flipvertical: ImageVector? = null
