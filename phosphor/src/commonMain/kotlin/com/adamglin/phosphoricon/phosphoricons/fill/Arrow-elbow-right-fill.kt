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

public val FillGroup.`Arrow-elbow-right-fill`: ImageVector
    get() {
        if (`_arrow-elbow-right-fill` != null) {
            return `_arrow-elbow-right-fill`!!
        }
        `_arrow-elbow-right-fill` = Builder(name = "Arrow-elbow-right-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 80.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.66f, 5.66f)
                lineTo(196.0f, 127.31f)
                lineToRelative(-70.34f, 70.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-96.0f, -96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 29.66f, 90.34f)
                lineTo(120.0f, 180.69f)
                lineTo(184.69f, 116.0f)
                lineTo(154.34f, 85.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 72.0f)
                horizontalLineToRelative(72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_arrow-elbow-right-fill`!!
    }

private var `_arrow-elbow-right-fill`: ImageVector? = null
