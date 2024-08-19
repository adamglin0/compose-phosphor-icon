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

public val BoldGroup.`Text-t-slash-bold`: ImageVector
    get() {
        if (`_text-t-slash-bold` != null) {
            return `_text-t-slash-bold`!!
        }
        `_text-t-slash-bold` = Builder(name = "Text-t-slash-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.07f, 224.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.95f, -0.81f)
                lineTo(140.0f, 159.0f)
                verticalLineToRelative(29.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(132.64f)
                lineTo(68.0f, 79.84f)
                verticalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(56.0f)
                arcToRelative(11.75f, 11.75f, 0.0f, false, true, 0.23f, -2.31f)
                lineToRelative(-5.11f, -5.62f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 56.88f, 31.93f)
                lineToRelative(160.0f, 176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.07f, 224.88f)
                close()
                moveTo(116.0f, 68.0f)
                verticalLineToRelative(0.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 24.0f, 0.0f)
                verticalLineTo(68.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(116.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.6f, 24.0f)
                close()
            }
        }
        .build()
        return `_text-t-slash-bold`!!
    }

private var `_text-t-slash-bold`: ImageVector? = null
