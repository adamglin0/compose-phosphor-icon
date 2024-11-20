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

public val ThinGroup.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) {
            return _cursorClick!!
        }
        _cursorClick = Builder(name = "CursorClick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 24.0f)
                lineTo(92.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(16.0f, 100.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(16.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(126.21f, 35.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.37f, -1.79f)
                lineToRelative(8.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.16f, -3.58f)
                lineToRelative(-8.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 126.21f, 35.58f)
                close()
                moveTo(30.21f, 124.42f)
                lineTo(14.21f, 132.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 7.16f)
                lineToRelative(16.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.58f, -7.16f)
                close()
                moveTo(216.49f, 186.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineTo(203.8f, 216.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-51.31f, -51.31f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, -3.58f, -1.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.89f, 2.27f)
                lineToRelative(-17.78f, 46.31f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, true, -0.07f, 0.16f)
                arcTo(11.85f, 11.85f, 0.0f, false, true, 100.26f, 220.0f)
                horizontalLineToRelative(-0.59f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, true, -10.8f, -8.23f)
                lineTo(36.6f, 51.68f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 51.68f, 36.6f)
                lineTo(211.76f, 88.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 1.05f, 22.33f)
                lineToRelative(-0.16f, 0.07f)
                lineToRelative(-46.31f, 17.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, 6.47f)
                close()
                moveTo(210.83f, 192.49f)
                lineTo(159.52f, 141.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.7f, -19.49f)
                lineToRelative(0.16f, -0.06f)
                lineToRelative(46.31f, -17.79f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, false, -0.42f, -7.35f)
                lineTo(49.2f, 44.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, 5.0f)
                lineTo(96.48f, 209.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.36f, 0.42f)
                lineToRelative(17.78f, -46.31f)
                arcToRelative(1.11f, 1.11f, 0.0f, false, true, 0.07f, -0.16f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.76f, -7.0f)
                arcToRelative(12.21f, 12.21f, 0.0f, false, true, 2.24f, -0.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.49f, 3.52f)
                lineToRelative(51.31f, 51.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.65f, 0.0f)
                lineToRelative(12.69f, -12.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.83f, 192.49f)
                close()
            }
        }
        .build()
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
