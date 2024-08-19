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

public val LightGroup.`Text-h-five-light`: ImageVector
    get() {
        if (`_text-h-five-light` != null) {
            return `_text-h-five-light`!!
        }
        `_text-h-five-light` = Builder(name = "Text-h-five-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 180.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -34.0f, 34.0f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, true, -24.29f, -9.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.58f, -8.4f)
                arcTo(21.65f, 21.65f, 0.0f, false, false, 212.0f, 202.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f)
                arcToRelative(21.65f, 21.65f, 0.0f, false, false, -15.71f, 6.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 186.08f, 159.0f)
                lineToRelative(8.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.92f, -5.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(205.08f)
                lineToRelative(-5.0f, 30.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 212.0f, 146.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 246.0f, 180.0f)
                close()
                moveTo(144.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(54.0f)
                horizontalLineTo(46.0f)
                verticalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(122.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 144.0f, 50.0f)
                close()
            }
        }
        .build()
        return `_text-h-five-light`!!
    }

private var `_text-h-five-light`: ImageVector? = null
