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

public val BoldGroup.`Orange-bold`: ImageVector
    get() {
        if (`_orange-bold` != null) {
            return `_orange-bold`!!
        }
        `_orange-bold` = Builder(name = "Orange-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 72.36f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 204.0f, 16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -56.0f, 29.49f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 72.0f, 4.0f)
                lineTo(64.0f, 4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(44.07f, 44.07f, 0.0f, false, true, 42.6f, 33.0f)
                arcTo(92.05f, 92.05f, 0.0f, true, false, 174.0f, 72.36f)
                close()
                moveTo(178.22f, 28.36f)
                arcToRelative(44.14f, 44.14f, 0.0f, false, true, -36.46f, 31.24f)
                arcTo(44.14f, 44.14f, 0.0f, false, true, 178.23f, 28.38f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, -68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(177.62f, 167.6f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -34.0f, 34.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -3.6f, 0.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.6f, -23.45f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 18.32f, -18.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.9f, 7.2f)
                close()
            }
        }
        .build()
        return `_orange-bold`!!
    }

private var `_orange-bold`: ImageVector? = null
