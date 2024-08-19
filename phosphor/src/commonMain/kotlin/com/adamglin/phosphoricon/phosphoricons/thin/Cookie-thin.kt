package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Cookie-thin`: ImageVector
    get() {
        if (`_cookie-thin` != null) {
            return `_cookie-thin`!!
        }
        `_cookie-thin` = Builder(name = "Cookie-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.66f, 166.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.32f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 161.66f, 166.34f)
                close()
                moveTo(86.34f, 158.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.32f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 86.34f, 158.34f)
                close()
                moveTo(89.66f, 102.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 11.32f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 89.66f, 102.34f)
                close()
                moveTo(126.34f, 118.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.32f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 126.34f, 118.34f)
                close()
                moveTo(228.0f, 128.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(219.92f, 131.84f)
                arcToRelative(52.08f, 52.08f, 0.0f, false, true, -47.78f, -48.0f)
                arcToRelative(52.08f, 52.08f, 0.0f, false, true, -48.0f, -47.78f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, false, 95.76f, 95.76f)
                close()
            }
        }
        .build()
        return `_cookie-thin`!!
    }

private var `_cookie-thin`: ImageVector? = null
