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

public val BoldGroup.Codesandboxlogo: ImageVector
    get() {
        if (_codesandboxlogo != null) {
            return _codesandboxlogo!!
        }
        _codesandboxlogo = Builder(name = "Codesandboxlogo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.6f, 62.65f)
                lineToRelative(-88.0f, -48.18f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, -19.2f, 0.0f)
                lineToRelative(-88.0f, 48.17f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 80.19f)
                verticalLineToRelative(95.62f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.4f, 17.55f)
                lineToRelative(88.0f, 48.17f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 19.2f, 0.0f)
                lineToRelative(88.0f, -48.18f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 175.81f)
                lineTo(236.0f, 80.19f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 225.6f, 62.65f)
                close()
                moveTo(164.0f, 152.0f)
                verticalLineToRelative(47.72f)
                lineToRelative(-24.0f, 13.14f)
                lineTo(140.0f, 135.11f)
                lineToRelative(72.0f, -39.42f)
                verticalLineToRelative(22.92f)
                lineToRelative(-41.76f, 22.86f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 152.0f)
                close()
                moveTo(85.76f, 141.47f)
                lineTo(44.0f, 118.61f)
                lineTo(44.0f, 95.69f)
                lineToRelative(72.0f, 39.42f)
                verticalLineToRelative(77.75f)
                lineTo(92.0f, 199.72f)
                lineTo(92.0f, 152.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 85.76f, 141.47f)
                close()
                moveTo(83.14f, 61.13f)
                lineToRelative(39.1f, 21.4f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 11.52f, 0.0f)
                lineToRelative(39.1f, -21.4f)
                lineTo(199.0f, 75.45f)
                lineToRelative(-71.0f, 38.87f)
                lineTo(57.0f, 75.45f)
                close()
                moveTo(128.0f, 36.57f)
                lineToRelative(19.87f, 10.88f)
                lineTo(128.0f, 58.33f)
                lineTo(108.13f, 47.45f)
                close()
                moveTo(44.0f, 146.0f)
                lineToRelative(24.0f, 13.14f)
                verticalLineToRelative(27.47f)
                lineTo(44.0f, 173.44f)
                close()
                moveTo(188.0f, 186.61f)
                lineTo(188.0f, 159.11f)
                lineTo(212.0f, 146.0f)
                verticalLineToRelative(27.47f)
                close()
            }
        }
        .build()
        return _codesandboxlogo!!
    }

private var _codesandboxlogo: ImageVector? = null
