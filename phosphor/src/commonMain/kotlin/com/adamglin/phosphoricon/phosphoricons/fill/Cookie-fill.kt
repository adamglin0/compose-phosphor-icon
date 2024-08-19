package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Cookie-fill`: ImageVector
    get() {
        if (`_cookie-fill` != null) {
            return `_cookie-fill`!!
        }
        `_cookie-fill` = Builder(name = "Cookie-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 120.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 120.0f)
                close()
                moveTo(75.51f, 99.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, 17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 75.51f, 99.51f)
                close()
                moveTo(100.51f, 172.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.49f, 172.49f)
                close()
                moveTo(123.51f, 132.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 123.51f, 132.49f)
                close()
                moveTo(164.51f, 180.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.49f, 180.49f)
                close()
            }
        }
        .build()
        return `_cookie-fill`!!
    }

private var `_cookie-fill`: ImageVector? = null
