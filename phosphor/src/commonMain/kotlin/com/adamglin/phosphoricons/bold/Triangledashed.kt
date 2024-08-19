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

public val BoldGroup.Triangledashed: ImageVector
    get() {
        if (_triangledashed != null) {
            return _triangledashed!!
        }
        _triangledashed = Builder(name = "Triangledashed", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(104.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 216.0f)
                close()
                moveTo(240.26f, 186.1f)
                lineTo(235.6f, 178.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.79f, 12.0f)
                lineToRelative(4.65f, 8.08f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, true, 0.0f, 3.73f)
                arcToRelative(4.46f, 4.46f, 0.0f, false, true, -4.0f, 2.2f)
                lineTo(192.0f, 204.01f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(23.46f)
                arcToRelative(28.31f, 28.31f, 0.0f, false, false, 24.79f, -14.19f)
                arcTo(27.47f, 27.47f, 0.0f, false, false, 240.26f, 186.1f)
                close()
                moveTo(64.0f, 204.0f)
                lineTo(40.55f, 204.0f)
                arcToRelative(4.46f, 4.46f, 0.0f, false, true, -4.0f, -2.2f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, true, 0.0f, -3.73f)
                lineTo(41.19f, 190.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 20.4f, 178.0f)
                lineToRelative(-4.66f, 8.09f)
                arcToRelative(27.47f, 27.47f, 0.0f, false, false, 0.0f, 27.71f)
                arcTo(28.31f, 28.31f, 0.0f, false, false, 40.55f, 228.0f)
                lineTo(64.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(202.17f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.39f, -18.0f)
                lineToRelative(-23.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.8f, 12.0f)
                lineToRelative(23.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 202.18f, 156.0f)
                close()
                moveTo(166.5f, 58.0f)
                lineTo(152.81f, 34.23f)
                arcToRelative(28.74f, 28.74f, 0.0f, false, false, -49.62f, 0.0f)
                lineTo(89.5f, 58.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.79f, 12.0f)
                lineTo(124.0f, 46.2f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(145.71f, 70.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.41f, 6.0f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, false, 6.0f, -1.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 166.5f, 58.0f)
                close()
                moveTo(82.85f, 93.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 66.46f, 98.0f)
                lineToRelative(-23.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.8f, 12.0f)
                lineToRelative(23.0f, -40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 82.85f, 93.6f)
                close()
            }
        }
        .build()
        return _triangledashed!!
    }

private var _triangledashed: ImageVector? = null
