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

public val LightGroup.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) {
            return _stackOverflowLogo!!
        }
        _stackOverflowLogo = Builder(name = "StackOverflowLogo", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 152.09f)
                lineTo(214.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(48.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(42.0f, 152.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(54.0f, 210.0f)
                lineTo(202.0f, 210.0f)
                lineTo(202.0f, 152.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(88.0f, 182.09f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                lineTo(88.0f, 170.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                close()
                moveTo(93.4f, 129.16f)
                lineTo(170.67f, 149.83f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 3.11f, -11.57f)
                lineTo(96.5f, 117.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.1f, 11.58f)
                close()
                moveTo(112.33f, 79.42f)
                lineTo(181.61f, 119.42f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, false, 3.0f, 0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, -11.18f)
                lineTo(118.33f, 69.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.0f, 10.38f)
                close()
                moveTo(200.08f, 92.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(152.0f, 27.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, 8.47f)
                close()
            }
        }
        .build()
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
