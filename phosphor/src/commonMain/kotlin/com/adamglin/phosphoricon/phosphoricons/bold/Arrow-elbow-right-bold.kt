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

public val BoldGroup.`Arrow-elbow-right-bold`: ImageVector
    get() {
        if (`_arrow-elbow-right-bold` != null) {
            return `_arrow-elbow-right-bold`!!
        }
        `_arrow-elbow-right-bold` = Builder(name = "Arrow-elbow-right-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 80.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(109.0f)
                lineToRelative(-91.51f, 91.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(120.0f, 175.0f)
                lineToRelative(83.0f, -83.0f)
                horizontalLineTo(160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_arrow-elbow-right-bold`!!
    }

private var `_arrow-elbow-right-bold`: ImageVector? = null
