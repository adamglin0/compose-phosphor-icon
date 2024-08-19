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

public val ThinGroup.Chatteardropdots: ImageVector
    get() {
        if (_chatteardropdots != null) {
            return _chatteardropdots!!
        }
        _chatteardropdots = Builder(name = "Chatteardropdots", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 140.0f, 128.0f)
                close()
                moveTo(88.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 120.0f)
                close()
                moveTo(176.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 120.0f)
                close()
                moveTo(228.0f, 124.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, true, -96.0f, 96.0f)
                lineTo(48.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(36.0f, 124.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 192.0f, 0.0f)
                close()
                moveTo(220.0f, 124.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -176.0f, 0.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(84.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 220.0f, 124.0f)
                close()
            }
        }
        .build()
        return _chatteardropdots!!
    }

private var _chatteardropdots: ImageVector? = null
