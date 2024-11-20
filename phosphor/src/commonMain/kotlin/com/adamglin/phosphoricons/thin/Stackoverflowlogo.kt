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

public val ThinGroup.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) {
            return _stackOverflowLogo!!
        }
        _stackOverflowLogo = Builder(name = "StackOverflowLogo", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 152.09f)
                lineTo(212.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 152.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(52.0f, 212.0f)
                lineTo(204.0f, 212.0f)
                lineTo(204.0f, 152.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(88.0f, 180.09f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                lineTo(88.0f, 172.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                close()
                moveTo(93.92f, 127.23f)
                lineTo(171.19f, 147.9f)
                arcToRelative(3.72f, 3.72f, 0.0f, false, false, 1.0f, 0.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, -7.85f)
                lineTo(96.0f, 119.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -2.07f, 7.72f)
                close()
                moveTo(113.33f, 77.69f)
                lineTo(182.61f, 117.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, -6.92f)
                lineTo(117.33f, 70.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 6.92f)
                close()
                moveTo(201.49f, 91.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.64f)
                lineToRelative(-56.57f, -56.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, 5.65f)
                close()
            }
        }
        .build()
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
