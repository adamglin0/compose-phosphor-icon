package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Paperclip-horizontal-light`: ImageVector
    get() {
        if (`_paperclip-horizontal-light` != null) {
            return `_paperclip-horizontal-light`!!
        }
        `_paperclip-horizontal-light` = Builder(name = "Paperclip-horizontal-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 128.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, true, -54.0f, 54.0f)
                horizontalLineTo(48.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 0.0f, -76.0f)
                horizontalLineTo(192.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 0.0f, 44.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(192.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                horizontalLineTo(48.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, 52.0f)
                horizontalLineTo(192.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 0.0f, -84.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(192.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, true, 246.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_paperclip-horizontal-light`!!
    }

private var `_paperclip-horizontal-light`: ImageVector? = null
