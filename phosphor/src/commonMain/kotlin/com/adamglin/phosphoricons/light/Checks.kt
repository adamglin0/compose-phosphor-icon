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

public val LightGroup.Checks: ImageVector
    get() {
        if (_checks != null) {
            return _checks!!
        }
        _checks = Builder(name = "Checks", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.2f, 84.28f)
                lineToRelative(-89.6f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.4f, 0.0f)
                lineTo(11.8f, 134.57f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 20.2f, 126.0f)
                lineToRelative(34.2f, 33.58f)
                lineToRelative(85.4f, -83.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.4f, 8.56f)
                close()
                moveTo(244.28f, 75.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -0.08f)
                lineToRelative(-85.4f, 83.87f)
                lineToRelative(-20.23f, -19.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.41f, 8.56f)
                lineToRelative(24.44f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.4f, 0.0f)
                lineToRelative(89.6f, -88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 244.28f, 75.8f)
                close()
            }
        }
        .build()
        return _checks!!
    }

private var _checks: ImageVector? = null
