package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Flowertulip: ImageVector
    get() {
        if (_flowertulip != null) {
            return _flowertulip!!
        }
        _flowertulip = Builder(name = "Flowertulip", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 48.0f)
                arcToRelative(87.48f, 87.48f, 0.0f, false, false, -35.36f, 7.43f)
                curveToRelative(-15.1f, -25.37f, -39.92f, -38.0f, -41.06f, -38.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                curveToRelative(-1.14f, 0.58f, -26.0f, 13.22f, -41.06f, 38.59f)
                arcTo(87.48f, 87.48f, 0.0f, false, false, 48.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(40.0f, 96.0f)
                arcToRelative(88.11f, 88.11f, 0.0f, false, false, 80.0f, 87.63f)
                verticalLineToRelative(35.43f)
                lineTo(83.58f, 200.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, 14.32f)
                lineToRelative(48.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f)
                lineToRelative(48.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, -14.32f)
                lineTo(136.0f, 219.06f)
                lineTo(136.0f, 183.63f)
                arcTo(88.11f, 88.11f, 0.0f, false, false, 216.0f, 96.0f)
                lineTo(216.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 48.0f)
                close()
                moveTo(120.0f, 167.56f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 56.0f, 96.0f)
                lineTo(56.0f, 64.44f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 120.0f, 136.0f)
                close()
                moveTo(128.0f, 99.36f)
                arcTo(88.4f, 88.4f, 0.0f, false, false, 97.36f, 63.19f)
                curveToRelative(9.57f, -15.79f, 24.0f, -25.9f, 30.64f, -30.0f)
                curveToRelative(6.65f, 4.08f, 21.08f, 14.19f, 30.64f, 30.0f)
                arcTo(88.46f, 88.46f, 0.0f, false, false, 128.0f, 99.36f)
                close()
                moveTo(200.0f, 96.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -64.0f, 71.56f)
                lineTo(136.0f, 136.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, 64.0f, -71.56f)
                close()
            }
        }
        .build()
        return _flowertulip!!
    }

private var _flowertulip: ImageVector? = null
