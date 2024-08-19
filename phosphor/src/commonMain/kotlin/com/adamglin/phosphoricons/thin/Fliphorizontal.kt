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

public val ThinGroup.Fliphorizontal: ImageVector
    get() {
        if (_fliphorizontal != null) {
            return _fliphorizontal!!
        }
        _fliphorizontal = Builder(name = "Fliphorizontal", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.38f, 28.26f)
                arcToRelative(11.76f, 11.76f, 0.0f, false, false, -13.44f, 7.08f)
                lineToRelative(0.0f, 0.08f)
                lineTo(29.0f, 195.32f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 212.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(116.0f, 40.0f)
                arcTo(11.75f, 11.75f, 0.0f, false, false, 106.38f, 28.26f)
                close()
                moveTo(108.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, -3.33f, -1.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.32f, -3.84f)
                lineToRelative(64.0f, -159.94f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 108.0f, 40.0f)
                close()
                moveTo(227.07f, 195.4f)
                lineTo(163.07f, 35.4f)
                lineTo(163.07f, 35.32f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 40.0f)
                lineTo(140.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.08f, -16.6f)
                close()
                moveTo(219.32f, 202.21f)
                arcTo(3.93f, 3.93f, 0.0f, false, true, 216.0f, 204.0f)
                lineTo(152.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(148.0f, 40.0f)
                arcToRelative(3.81f, 3.81f, 0.0f, false, true, 3.2f, -3.92f)
                arcToRelative(4.64f, 4.64f, 0.0f, false, true, 0.9f, -0.09f)
                arcToRelative(3.69f, 3.69f, 0.0f, false, true, 3.57f, 2.42f)
                lineToRelative(64.0f, 160.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 219.32f, 202.21f)
                close()
            }
        }
        .build()
        return _fliphorizontal!!
    }

private var _fliphorizontal: ImageVector? = null
