package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) {
            return _chatsCircle!!
        }
        _chatsCircle = Builder(name = "ChatsCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.34f, 187.09f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 172.29f, 68.9f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 19.66f, 139.09f)
                lineToRelative(-6.84f, 23.26f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 24.83f, 24.83f)
                lineToRelative(23.26f, -6.84f)
                arcToRelative(83.94f, 83.94f, 0.0f, false, false, 22.76f, 6.74f)
                arcToRelative(84.06f, 84.06f, 0.0f, false, false, 111.42f, 41.26f)
                lineToRelative(23.26f, 6.84f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 24.83f, -24.83f)
                close()
                moveTo(62.0f, 155.5f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, -3.39f, 0.49f)
                lineToRelative(-20.72f, 6.09f)
                lineTo(44.0f, 141.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.93f, -9.0f)
                arcTo(60.0f, 60.0f, 0.0f, true, true, 67.7f, 156.92f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 62.0f, 155.5f)
                close()
                moveTo(212.89f, 180.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.93f, 9.0f)
                lineToRelative(6.09f, 20.73f)
                lineTo(197.36f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.06f, 0.93f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 111.0f, 186.63f)
                arcToRelative(83.93f, 83.93f, 0.0f, false, false, 68.55f, -91.37f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 33.38f, 85.0f)
                close()
            }
        }
        .build()
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
