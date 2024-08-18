package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Arrow-bend-up-left`: ImageVector
    get() {
        if (`_arrow-bend-up-left` != null) {
            return `_arrow-bend-up-left`!!
        }
        `_arrow-bend-up-left` = Builder(name = "Arrow-bend-up-left", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, -88.0f, -88.0f)
                horizontalLineTo(51.31f)
                lineToRelative(34.35f, 34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineToRelative(48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 85.66f, 61.66f)
                lineTo(51.31f, 96.0f)
                horizontalLineTo(128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_arrow-bend-up-left`!!
    }

private var `_arrow-bend-up-left`: ImageVector? = null
