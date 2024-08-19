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

public val BoldGroup.`Text-a-underline-bold`: ImageVector
    get() {
        if (`_text-a-underline-bold` != null) {
            return `_text-a-underline-bold`!!
        }
        `_text-a-underline-bold` = Builder(name = "Text-a-underline-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.89f, 178.86f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.0f, -5.75f)
                lineTo(90.44f, 140.0f)
                horizontalLineToRelative(75.12f)
                lineToRelative(15.58f, 33.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 21.72f, -10.22f)
                lineToRelative(-64.0f, -136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.72f, 0.0f)
                lineToRelative(-64.0f, 136.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 58.89f, 178.86f)
                close()
                moveTo(128.0f, 60.18f)
                lineTo(154.27f, 116.0f)
                horizontalLineTo(101.73f)
                close()
                moveTo(228.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(216.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 216.0f)
                close()
            }
        }
        .build()
        return `_text-a-underline-bold`!!
    }

private var `_text-a-underline-bold`: ImageVector? = null
