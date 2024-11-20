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

public val BoldGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 154.8f)
                lineToRelative(-47.09f, -21.11f)
                lineToRelative(-0.18f, -0.08f)
                arcToRelative(19.94f, 19.94f, 0.0f, false, false, -19.0f, 1.75f)
                arcToRelative(13.08f, 13.08f, 0.0f, false, false, -1.12f, 0.84f)
                lineToRelative(-22.31f, 19.0f)
                curveToRelative(-13.0f, -7.05f, -26.43f, -20.37f, -33.49f, -33.21f)
                lineToRelative(19.06f, -22.66f)
                arcToRelative(11.76f, 11.76f, 0.0f, false, false, 0.85f, -1.15f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 1.66f, -18.83f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, true, -0.08f, -0.18f)
                lineTo(101.2f, 32.0f)
                arcTo(20.06f, 20.06f, 0.0f, false, false, 80.42f, 20.15f)
                arcTo(60.27f, 60.27f, 0.0f, false, false, 28.0f, 80.0f)
                curveToRelative(0.0f, 81.61f, 66.39f, 148.0f, 148.0f, 148.0f)
                arcToRelative(60.27f, 60.27f, 0.0f, false, false, 59.85f, -52.42f)
                arcTo(20.06f, 20.06f, 0.0f, false, false, 224.0f, 154.8f)
                close()
                moveTo(176.0f, 204.0f)
                arcTo(124.15f, 124.15f, 0.0f, false, true, 52.0f, 80.0f)
                arcTo(36.29f, 36.29f, 0.0f, false, true, 80.48f, 44.46f)
                lineToRelative(18.82f, 42.0f)
                lineTo(80.14f, 109.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.86f, 1.16f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 78.0f, 130.08f)
                curveToRelative(9.42f, 19.28f, 28.83f, 38.56f, 48.31f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 146.0f, 176.63f)
                arcToRelative(11.63f, 11.63f, 0.0f, false, false, 1.11f, -0.85f)
                lineToRelative(22.43f, -19.07f)
                lineToRelative(42.0f, 18.81f)
                arcTo(36.29f, 36.29f, 0.0f, false, true, 176.0f, 204.0f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
