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

public val FillGroup.`Gitlab-logo-simple-fill`: ImageVector
    get() {
        if (`_gitlab-logo-simple-fill` != null) {
            return `_gitlab-logo-simple-fill`!!
        }
        `_gitlab-logo-simple-fill` = Builder(name = "Gitlab-logo-simple-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.14f, 178.06f)
                lineToRelative(-73.27f, 51.76f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, true, -13.74f, 0.0f)
                lineTo(47.86f, 178.06f)
                arcToRelative(57.19f, 57.19f, 0.0f, false, true, -22.0f, -61.0f)
                lineTo(45.75f, 41.0f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, true, 22.79f, -1.11f)
                lineTo(86.22f, 88.0f)
                horizontalLineToRelative(83.56f)
                lineToRelative(17.68f, -48.13f)
                arcTo(11.94f, 11.94f, 0.0f, false, true, 210.25f, 41.0f)
                lineToRelative(19.9f, 76.12f)
                arcTo(57.19f, 57.19f, 0.0f, false, true, 208.14f, 178.06f)
                close()
            }
        }
        .build()
        return `_gitlab-logo-simple-fill`!!
    }

private var `_gitlab-logo-simple-fill`: ImageVector? = null
