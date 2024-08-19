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

public val LightGroup.`Text-t-slash-light`: ImageVector
    get() {
        if (`_text-t-slash-light` != null) {
            return `_text-t-slash-light`!!
        }
        `_text-t-slash-light` = Builder(name = "Text-t-slash-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 220.44f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -0.4f)
                lineTo(134.0f, 143.52f)
                verticalLineTo(194.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(26.0f)
                verticalLineTo(130.32f)
                lineToRelative(-60.0f, -66.0f)
                verticalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.19f, -3.57f)
                lineTo(43.56f, 44.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 52.44f, 36.0f)
                lineToRelative(160.0f, 176.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 212.0f, 220.44f)
                close()
                moveTo(105.79f, 62.0f)
                horizontalLineTo(122.0f)
                verticalLineTo(80.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(62.0f)
                horizontalLineToRelative(60.0f)
                verticalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineTo(105.79f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_text-t-slash-light`!!
    }

private var `_text-t-slash-light`: ImageVector? = null
