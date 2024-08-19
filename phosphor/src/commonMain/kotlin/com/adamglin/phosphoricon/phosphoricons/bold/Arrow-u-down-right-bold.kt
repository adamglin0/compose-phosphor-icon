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

public val BoldGroup.`Arrow-u-down-right-bold`: ImageVector
    get() {
        if (`_arrow-u-down-right-bold` != null) {
            return `_arrow-u-down-right-bold`!!
        }
        `_arrow-u-down-right-bold` = Builder(name = "Arrow-u-down-right-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 176.49f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(195.0f, 180.0f)
                horizontalLineTo(88.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 88.0f, 44.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(88.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, 88.0f)
                horizontalLineTo(195.0f)
                lineToRelative(-27.52f, -27.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineToRelative(48.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.49f, 176.49f)
                close()
            }
        }
        .build()
        return `_arrow-u-down-right-bold`!!
    }

private var `_arrow-u-down-right-bold`: ImageVector? = null
