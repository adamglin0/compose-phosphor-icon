package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) {
            return _shareNetwork!!
        }
        _shareNetwork = Builder(name = "ShareNetwork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 200.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -69.85f, -12.25f)
                lineToRelative(-53.0f, -34.05f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 0.0f, -51.4f)
                lineToRelative(53.0f, -34.0f)
                arcToRelative(36.09f, 36.09f, 0.0f, true, true, 8.67f, 13.45f)
                lineToRelative(-53.0f, 34.05f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 24.5f)
                lineToRelative(53.0f, 34.05f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 212.0f, 200.0f)
                close()
            }
        }
        .build()
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
