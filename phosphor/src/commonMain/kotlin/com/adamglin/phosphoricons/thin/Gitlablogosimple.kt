package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Gitlablogosimple: ImageVector
    get() {
        if (_gitlablogosimple != null) {
            return _gitlablogosimple!!
        }
        _gitlablogosimple = Builder(name = "Gitlablogosimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.27f, 118.11f)
                lineTo(206.38f, 42.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, false, -15.16f, -0.75f)
                lineTo(172.57f, 92.0f)
                lineTo(83.43f, 92.0f)
                lineTo(64.78f, 41.24f)
                arcTo(7.94f, 7.94f, 0.0f, false, false, 49.62f, 42.0f)
                lineTo(29.73f, 118.11f)
                arcToRelative(53.16f, 53.16f, 0.0f, false, false, 20.44f, 56.68f)
                lineToRelative(73.27f, 51.76f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 9.12f, 0.0f)
                lineToRelative(73.27f, -51.76f)
                arcTo(53.16f, 53.16f, 0.0f, false, false, 226.27f, 118.11f)
                close()
                moveTo(201.22f, 168.25f)
                lineTo(128.0f, 220.0f)
                lineTo(54.78f, 168.25f)
                arcToRelative(45.11f, 45.11f, 0.0f, false, true, -17.31f, -48.11f)
                lineToRelative(19.84f, -76.0f)
                lineTo(76.89f, 97.38f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 80.64f, 100.0f)
                horizontalLineToRelative(94.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.75f, -2.62f)
                lineToRelative(19.57f, -53.22f)
                lineToRelative(19.85f, 76.0f)
                arcTo(45.11f, 45.11f, 0.0f, false, true, 201.22f, 168.25f)
                close()
            }
        }
        .build()
        return _gitlablogosimple!!
    }

private var _gitlablogosimple: ImageVector? = null
