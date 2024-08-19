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

public val BoldGroup.`Text-h-three-bold`: ImageVector
    get() {
        if (`_text-h-three-bold` != null) {
            return `_text-h-three-bold`!!
        }
        `_text-h-three-bold` = Builder(name = "Text-h-three-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 180.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -68.57f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.14f, -16.79f)
                arcTo(16.0f, 16.0f, 0.0f, true, false, 212.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.83f, -18.88f)
                lineTo(217.0f, 124.0f)
                horizontalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.83f, 18.88f)
                lineToRelative(-18.34f, 26.2f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 252.0f, 180.0f)
                close()
                moveTo(144.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.0f, 44.0f)
                close()
            }
        }
        .build()
        return `_text-h-three-bold`!!
    }

private var `_text-h-three-bold`: ImageVector? = null
