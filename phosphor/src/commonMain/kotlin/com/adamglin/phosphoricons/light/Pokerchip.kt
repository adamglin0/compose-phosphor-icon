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

public val LightGroup.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) {
            return _pokerChip!!
        }
        _pokerChip = Builder(name = "PokerChip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 178.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, true, true, 50.0f, -50.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 128.0f, 178.0f)
                close()
                moveTo(167.37f, 80.14f)
                arcTo(61.68f, 61.68f, 0.0f, false, false, 134.0f, 66.3f)
                lineTo(134.0f, 38.2f)
                arcToRelative(89.64f, 89.64f, 0.0f, false, true, 53.22f, 22.09f)
                close()
                moveTo(122.0f, 66.3f)
                arcTo(61.68f, 61.68f, 0.0f, false, false, 88.63f, 80.14f)
                lineTo(68.78f, 60.29f)
                arcTo(89.64f, 89.64f, 0.0f, false, true, 122.0f, 38.2f)
                close()
                moveTo(80.14f, 88.63f)
                arcTo(61.68f, 61.68f, 0.0f, false, false, 66.3f, 122.0f)
                lineTo(38.2f, 122.0f)
                arcTo(89.61f, 89.61f, 0.0f, false, true, 60.29f, 68.78f)
                close()
                moveTo(66.3f, 134.0f)
                arcToRelative(61.68f, 61.68f, 0.0f, false, false, 13.84f, 33.37f)
                lineTo(60.29f, 187.22f)
                arcTo(89.61f, 89.61f, 0.0f, false, true, 38.2f, 134.0f)
                close()
                moveTo(88.63f, 175.86f)
                arcTo(61.68f, 61.68f, 0.0f, false, false, 122.0f, 189.7f)
                verticalLineToRelative(28.1f)
                arcToRelative(89.64f, 89.64f, 0.0f, false, true, -53.22f, -22.09f)
                close()
                moveTo(134.0f, 189.7f)
                arcToRelative(61.68f, 61.68f, 0.0f, false, false, 33.37f, -13.84f)
                lineToRelative(19.85f, 19.85f)
                arcTo(89.64f, 89.64f, 0.0f, false, true, 134.0f, 217.8f)
                close()
                moveTo(175.86f, 167.37f)
                arcTo(61.68f, 61.68f, 0.0f, false, false, 189.7f, 134.0f)
                horizontalLineToRelative(28.1f)
                arcToRelative(89.61f, 89.61f, 0.0f, false, true, -22.09f, 53.22f)
                close()
                moveTo(189.7f, 122.0f)
                arcToRelative(61.68f, 61.68f, 0.0f, false, false, -13.84f, -33.37f)
                lineToRelative(19.85f, -19.85f)
                arcTo(89.61f, 89.61f, 0.0f, false, true, 217.8f, 122.0f)
                close()
            }
        }
        .build()
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
