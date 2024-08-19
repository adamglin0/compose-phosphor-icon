package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Recycle-bold`: ImageVector
    get() {
        if (`_recycle-bold` != null) {
            return `_recycle-bold`!!
        }
        `_recycle-bold` = Builder(name = "Recycle-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(40.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -24.23f, -42.0f)
                lineToRelative(29.45f, -50.88f)
                lineToRelative(-4.76f, 1.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -6.2f, -23.18f)
                lineToRelative(32.77f, -8.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.69f, 8.48f)
                lineToRelative(8.79f, 32.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -23.17f, 6.22f)
                lineTo(66.08f, 139.0f)
                lineToRelative(-29.5f, 51.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 196.0f)
                horizontalLineTo(88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 208.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, 3.46f, 2.0f)
                lineToRelative(29.45f, 50.87f)
                lineToRelative(-4.75f, -1.27f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 150.0f, 110.78f)
                lineToRelative(32.77f, 8.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.69f, -8.48f)
                lineTo(206.2f, 78.3f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 183.0f, 72.08f)
                lineToRelative(-1.31f, 4.86f)
                lineTo(152.23f, 26.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -48.46f, 0.0f)
                lineTo(80.61f, 66.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.77f, 12.0f)
                lineToRelative(23.16f, -40.0f)
                arcTo(3.87f, 3.87f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(240.19f, 178.0f)
                lineToRelative(-23.14f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.77f, 12.0f)
                lineToRelative(23.14f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.46f, 6.0f)
                horizontalLineTo(157.0f)
                lineToRelative(3.51f, -3.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, -17.0f)
                lineTo(157.0f, 220.0f)
                horizontalLineToRelative(59.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 24.23f, -42.0f)
                close()
            }
        }
        .build()
        return `_recycle-bold`!!
    }

private var `_recycle-bold`: ImageVector? = null
