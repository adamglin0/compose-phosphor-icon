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

public val FillGroup.`Arrow-elbow-right-up-fill`: ImageVector
    get() {
        if (`_arrow-elbow-right-up-fill` != null) {
            return `_arrow-elbow-right-up-fill`!!
        }
        `_arrow-elbow-right-up-fill` = Builder(name = "Arrow-elbow-right-up-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.39f, 99.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 104.0f)
                horizontalLineTo(176.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(104.0f)
                horizontalLineTo(120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 223.39f, 99.06f)
                close()
            }
        }
        .build()
        return `_arrow-elbow-right-up-fill`!!
    }

private var `_arrow-elbow-right-up-fill`: ImageVector? = null
