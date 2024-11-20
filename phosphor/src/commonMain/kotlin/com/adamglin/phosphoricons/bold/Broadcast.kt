package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Broadcast: ImageVector
    get() {
        if (_broadcast != null) {
            return _broadcast!!
        }
        _broadcast = Builder(name = "Broadcast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
                moveTo(205.39f, 160.7f)
                arcTo(83.94f, 83.94f, 0.0f, false, true, 190.61f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.89f, -16.0f)
                arcToRelative(59.92f, 59.92f, 0.0f, false, false, 0.0f, -80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.89f, -16.0f)
                arcToRelative(84.07f, 84.07f, 0.0f, false, true, 14.78f, 88.7f)
                close()
                moveTo(83.28f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.89f, 16.0f)
                arcToRelative(83.94f, 83.94f, 0.0f, false, true, 0.0f, -112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 83.28f, 88.0f)
                arcToRelative(59.92f, 59.92f, 0.0f, false, false, 0.0f, 80.0f)
                close()
                moveTo(252.0f, 128.0f)
                arcToRelative(123.63f, 123.63f, 0.0f, false, true, -35.43f, 86.78f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 199.43f, 198.0f)
                arcToRelative(99.88f, 99.88f, 0.0f, false, false, 0.0f, -140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.14f, -16.8f)
                arcTo(123.63f, 123.63f, 0.0f, false, true, 252.0f, 128.0f)
                close()
                moveTo(56.57f, 198.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.14f, 16.8f)
                arcToRelative(123.89f, 123.89f, 0.0f, false, true, 0.0f, -173.56f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.57f, 58.0f)
                arcToRelative(99.88f, 99.88f, 0.0f, false, false, 0.0f, 140.0f)
                close()
            }
        }
        .build()
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
