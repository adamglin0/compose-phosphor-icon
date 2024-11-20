package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) {
            return _cloudCheck!!
        }
        _cloudCheck = Builder(name = "CloudCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 42.0f)
                arcTo(86.11f, 86.11f, 0.0f, false, false, 82.43f, 90.88f)
                arcTo(62.0f, 62.0f, 0.0f, true, false, 72.0f, 214.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 0.0f, -172.0f)
                close()
                moveTo(160.0f, 202.0f)
                lineTo(72.0f, 202.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 0.0f, -100.0f)
                arcToRelative(50.67f, 50.67f, 0.0f, false, true, 5.91f, 0.35f)
                arcTo(85.61f, 85.61f, 0.0f, false, false, 74.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, true, 74.0f, 74.0f)
                close()
                moveTo(196.24f, 107.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(144.0f, 151.51f)
                lineToRelative(43.76f, -43.75f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 196.24f, 107.76f)
                close()
            }
        }
        .build()
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
