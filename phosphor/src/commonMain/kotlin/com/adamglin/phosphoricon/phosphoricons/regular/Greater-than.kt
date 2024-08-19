package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Greater-than`: ImageVector
    get() {
        if (`_greater-than` != null) {
            return `_greater-than`!!
        }
        `_greater-than` = Builder(name = "Greater-than", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.58f, 7.23f)
                lineToRelative(-152.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -6.85f, -14.46f)
                lineTo(197.31f, 128.0f)
                lineTo(60.58f, 63.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.85f, -14.46f)
                lineToRelative(152.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_greater-than`!!
    }

private var `_greater-than`: ImageVector? = null
