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

public val ThinGroup.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) {
            return _pushPinSimpleSlash!!
        }
        _pushPinSimpleSlash = Builder(name = "PushPinSimpleSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.25f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(192.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(180.77f, 44.0f)
                lineToRelative(19.58f, 111.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.24f, 4.63f)
                arcToRelative(3.33f, 3.33f, 0.0f, false, true, -0.7f, 0.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.93f, -3.31f)
                lineTo(172.64f, 44.0f)
                lineTo(91.25f, 44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 87.25f, 40.0f)
                close()
                moveTo(210.69f, 219.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.65f, -0.27f)
                lineTo(169.87f, 180.0f)
                lineTo(132.0f, 180.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 180.0f)
                lineTo(40.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(52.64f, 172.0f)
                lineTo(70.52f, 70.72f)
                lineTo(45.0f, 42.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 51.0f, 37.31f)
                lineToRelative(160.0f, 176.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 210.69f, 219.0f)
                close()
                moveTo(162.59f, 172.0f)
                lineTo(77.32f, 78.2f)
                lineTo(60.77f, 172.0f)
                close()
            }
        }
        .build()
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
