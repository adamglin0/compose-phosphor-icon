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

public val LightGroup.MarkdownLogo: ImageVector
    get() {
        if (_markdownLogo != null) {
            return _markdownLogo!!
        }
        _markdownLogo = Builder(name = "MarkdownLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 50.0f)
                lineTo(24.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 10.0f, 64.0f)
                lineTo(10.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(232.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(246.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 232.0f, 50.0f)
                close()
                moveTo(234.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(24.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(22.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(232.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(126.0f, 104.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(114.0f, 118.49f)
                lineTo(92.24f, 140.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineTo(62.0f, 118.49f)
                lineTo(62.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(50.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.24f, -4.24f)
                lineTo(88.0f, 127.51f)
                lineToRelative(27.76f, -27.75f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 126.0f, 104.0f)
                close()
                moveTo(204.24f, 123.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, -8.48f)
                lineTo(170.0f, 137.51f)
                lineTo(170.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(33.51f)
                lineToRelative(13.76f, -13.75f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 204.24f, 123.76f)
                close()
            }
        }
        .build()
        return _markdownLogo!!
    }

private var _markdownLogo: ImageVector? = null
