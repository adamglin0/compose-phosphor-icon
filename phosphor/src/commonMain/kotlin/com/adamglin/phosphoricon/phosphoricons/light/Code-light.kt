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

public val LightGroup.`Code-light`: ImageVector
    get() {
        if (`_code-light` != null) {
            return `_code-light`!!
        }
        `_code-light` = Builder(name = "Code-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(67.84f, 92.61f)
                lineTo(25.37f, 128.0f)
                lineToRelative(42.47f, 35.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.68f, 9.22f)
                lineToRelative(-48.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -9.22f)
                lineToRelative(48.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.68f, 9.22f)
                close()
                moveTo(243.84f, 123.39f)
                lineTo(195.84f, 83.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -7.68f, 9.22f)
                lineTo(230.63f, 128.0f)
                lineToRelative(-42.47f, 35.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.68f, 9.22f)
                lineToRelative(48.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -9.22f)
                close()
                moveTo(162.05f, 34.39f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 154.36f, 38.0f)
                lineToRelative(-64.0f, 176.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 94.0f, 221.64f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, false, 2.0f, 0.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.64f, -3.95f)
                lineToRelative(64.0f, -176.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 162.05f, 34.36f)
                close()
            }
        }
        .build()
        return `_code-light`!!
    }

private var `_code-light`: ImageVector? = null
