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

public val RegularGroup.`Letter-circle-v`: ImageVector
    get() {
        if (`_letter-circle-v` != null) {
            return `_letter-circle-v`!!
        }
        `_letter-circle-v` = Builder(name = "Letter-circle-v", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(167.43f, 99.0f)
                lineToRelative(-32.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.86f, 0.0f)
                lineToRelative(-32.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 103.43f, 93.0f)
                lineTo(128.0f, 154.46f)
                lineTo(152.57f, 93.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 167.43f, 99.0f)
                close()
            }
        }
        .build()
        return `_letter-circle-v`!!
    }

private var `_letter-circle-v`: ImageVector? = null
