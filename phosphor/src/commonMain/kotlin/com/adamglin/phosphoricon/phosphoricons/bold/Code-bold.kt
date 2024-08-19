package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Code-bold`: ImageVector
    get() {
        if (`_code-bold` != null) {
            return `_code-bold`!!
        }
        `_code-bold` = Builder(name = "Code-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.68f, 97.22f)
                lineTo(34.74f, 128.0f)
                lineToRelative(36.94f, 30.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -15.36f, 18.44f)
                lineToRelative(-48.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -18.44f)
                lineToRelative(48.0f, -40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 71.68f, 97.22f)
                close()
                moveTo(247.68f, 118.78f)
                lineTo(199.68f, 78.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -15.36f, 18.44f)
                lineTo(221.26f, 128.0f)
                lineToRelative(-36.94f, 30.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 15.36f, 18.44f)
                lineToRelative(48.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -18.44f)
                close()
                moveTo(164.1f, 28.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.38f, 7.18f)
                lineToRelative(-64.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.18f, 15.37f)
                arcTo(11.79f, 11.79f, 0.0f, false, false, 96.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.28f, -7.9f)
                lineToRelative(64.0f, -176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.1f, 28.72f)
                close()
            }
        }
        .build()
        return `_code-bold`!!
    }

private var `_code-bold`: ImageVector? = null
