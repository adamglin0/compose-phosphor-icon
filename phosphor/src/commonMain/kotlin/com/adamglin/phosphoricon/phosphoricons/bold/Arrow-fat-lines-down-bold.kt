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

public val BoldGroup.`Arrow-fat-lines-down-bold`: ImageVector
    get() {
        if (`_arrow-fat-lines-down-bold` != null) {
            return `_arrow-fat-lines-down-bold`!!
        }
        `_arrow-fat-lines-down-bold` = Builder(name = "Arrow-fat-lines-down-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.09f, 131.41f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 124.0f)
                lineTo(188.0f, 124.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(80.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(32.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 20.49f)
                lineToRelative(96.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 235.09f, 131.41f)
                close()
                moveTo(128.0f, 215.0f)
                lineTo(61.0f, 148.0f)
                lineTo(80.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(68.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(80.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 40.0f)
                close()
                moveTo(68.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 68.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(80.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_arrow-fat-lines-down-bold`!!
    }

private var `_arrow-fat-lines-down-bold`: ImageVector? = null
