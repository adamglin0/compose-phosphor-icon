package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Compass-rose-fill`: ImageVector
    get() {
        if (`_compass-rose-fill` != null) {
            return `_compass-rose-fill`!!
        }
        `_compass-rose-fill` = Builder(name = "Compass-rose-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.94f, 120.24f)
                lineToRelative(-27.05f, -6.76f)
                arcToRelative(95.86f, 95.86f, 0.0f, false, false, -80.37f, -80.37f)
                lineToRelative(-6.76f, -27.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.52f, 0.0f)
                lineToRelative(-6.76f, 27.05f)
                arcToRelative(95.86f, 95.86f, 0.0f, false, false, -80.37f, 80.37f)
                lineToRelative(-27.0f, 6.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 15.52f)
                lineToRelative(27.05f, 6.76f)
                arcToRelative(95.86f, 95.86f, 0.0f, false, false, 80.37f, 80.37f)
                lineToRelative(6.76f, 27.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.52f, 0.0f)
                lineToRelative(6.76f, -27.05f)
                arcToRelative(95.86f, 95.86f, 0.0f, false, false, 80.37f, -80.37f)
                lineToRelative(27.05f, -6.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -15.52f)
                close()
                moveTo(205.77f, 109.24f)
                lineTo(158.6f, 97.4f)
                lineTo(146.8f, 50.23f)
                arcTo(79.88f, 79.88f, 0.0f, false, true, 205.77f, 109.2f)
                close()
                moveTo(109.2f, 50.24f)
                lineTo(97.4f, 97.4f)
                lineTo(50.23f, 109.2f)
                arcTo(79.88f, 79.88f, 0.0f, false, true, 109.2f, 50.23f)
                close()
                moveTo(50.2f, 146.81f)
                lineTo(97.4f, 158.6f)
                lineToRelative(11.8f, 47.17f)
                arcTo(79.88f, 79.88f, 0.0f, false, true, 50.23f, 146.8f)
                close()
                moveTo(146.77f, 205.81f)
                lineTo(158.57f, 158.64f)
                lineTo(205.74f, 146.84f)
                arcTo(79.88f, 79.88f, 0.0f, false, true, 146.8f, 205.77f)
                close()
            }
        }
        .build()
        return `_compass-rose-fill`!!
    }

private var `_compass-rose-fill`: ImageVector? = null
